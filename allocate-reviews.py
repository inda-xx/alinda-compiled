import random
import sys

def distribute_reviews(input_file, reviewers=3, crossover_size=5):
    # Read URLs from file
    with open(input_file, "r") as f:
        urls = [line.strip() for line in f if line.strip()]

    # Check if the number of URLs is divisible by the number of reviewers
    if len(urls) % reviewers != 0:
        print(f"Error: The number of URLs ({len(urls)}) is not evenly divisible by {reviewers}.")
        return

    # Shuffle URLs
    random.shuffle(urls)

    # Calculate group size
    group_size = len(urls) // reviewers

    # Divide into reviewer groups
    reviewer_groups = [urls[i * group_size:(i + 1) * group_size] for i in range(reviewers)]

    # Create crossover samples and output groups
    final_groups = []
    all_crossover_urls = set()
    for i in range(reviewers):
        unique = reviewer_groups[i][crossover_size:]  # Unique URLs for each reviewer
        shared = (
            reviewer_groups[i][:crossover_size]  # Shared with the next reviewer
            + reviewer_groups[i - 1][:crossover_size]  # Shared with the previous reviewer
        )
        all_crossover_urls.update(shared)  # Track all crossover URLs
        final_groups.append(unique + shared)

    # Write output files for each reviewer
    for i, group in enumerate(final_groups, 1):
        output_file = f"reviewer_{i}_urls.txt"
        with open(output_file, "w") as f:
            f.write("\n".join(group))
        print(f"Reviewer {i}: {len(group)} URLs written to {output_file}")

    # Write the crossover URLs to a separate file
    crossover_file = "crossover_reviews.txt"
    with open(crossover_file, "w") as f:
        f.write("\n".join(sorted(all_crossover_urls)))  # Sort for consistent output
    print(f"All crossover URLs written to {crossover_file}")

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python distribute_with_crossover.py <file_of_urls>")
        sys.exit(1)

    input_file = sys.argv[1]
    distribute_reviews(input_file)
