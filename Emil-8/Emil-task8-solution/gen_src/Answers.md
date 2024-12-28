# Answers

## Task 1

### 1. Describe the `three-body problem` in classical physics and what makes it distinct from `two-body problems`.

The three-body problem involves predicting the motion of three bodies that interact with each other through gravitational forces. Unlike the two-body problem, which has exact solutions due to the simplified interactions between two bodies, the three-body problem is much more complex because all three bodies influence each other gravitationally. This complexity makes the system chaotic and highly sensitive to initial conditions, which complicates the prediction of orbits.

### 2. Explain why the `three-body problem` generally does not have a closed-form solution. Discuss any known special cases or approximations.

The three-body problem typically lacks a closed-form solution because the equations of motion lead to nonlinear differential equations that cannot be integrated into a single formula. The problem’s chaotic nature means that slight differences in initial conditions can result in vastly different trajectories, making a general solution difficult. However, there are special cases and approximations. For instance, Lagrange and Euler identified specific stable configurations (Lagrangian points) where gravitational forces are balanced. Numerical methods and simulations are also frequently used to approximate solutions.

## Task 2

### 1. Describe typical formats for storing astrophysical data (e.g., `CSV`, `JSON`, `XML`) and discuss the pros and cons of each in the context of simulation data.

- **CSV:** Commonly used for simple tabular data. It is easy to read, widely supported, and lightweight. However, CSV lacks structure for nested data and is less efficient for representing complex hierarchical data structures.
- **JSON:** JSON supports nested and hierarchical data, making it suitable for more complex datasets, such as astrophysical simulations requiring structured data. However, JSON files can be larger than CSV files and may require more computational power to parse.
- **XML:** XML is highly structured and capable of describing complex data relationships. It is robust for data with a schema, but its extensive formatting can make files very large and slower to parse compared to CSV or JSON.

### 2. Outline a strategy for parsing data from a chosen format to instantiate objects. Include considerations for error handling and data integrity.

To parse data, choose a format such as JSON, which supports complex structures well. Begin by reading the JSON data and mapping it to appropriate class attributes. For error handling, use try-except blocks to manage parsing errors, with checks for data type validation and required fields to ensure data integrity. Log or raise errors for missing fields and invalid formats to allow the program to handle data anomalies without crashing. For large datasets, consider using chunked parsing to manage memory usage efficiently.