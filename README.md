## AI Enabled B2B Invoice Management System

### Objective:
The goal of this project is to develop a feature-rich Full-stack Invoice Management Application that leverages AI capabilities, using a technology stack consisting of ReactJS, JDBC, Java Servlets, and FLASK.

### Mandatory Features:
- Build a responsive Receivables Dashboard with an intuitive user interface for efficient data representation.
- Implement data loading from the provided Invoices database into the application using JDBC and MySQL.
- Create a grid-based data visualization with search and pagination functionality to easily manage and access invoices.
- Enable CRUD operations (Add, Edit, Delete) for handling invoice data directly from the grid.
- Implement the "Predict" button that utilizes AI (integrated with FLASK) to automatically populate the Order Amount column for selected invoices.

### Optional Features (Extra Credit Points):
- Enhance the search functionality with an advanced search option that allows users to use multiple criteria for precise filtering.
- Design an Analytics View featuring bar graphs and pie charts based on Distribution Channel and Customer Number data.
- Add a shortcut search button on the grid to quickly find invoices by Customer Order ID.

### Technical Guidelines:
- Utilize ReactJS for building the frontend UI with a Test-Driven Development (TDD) approach to ensure code quality.
- Create a Dynamic Web Project for the backend using Java Servlets and SQL with TDD methodology.
- Import the provided SQL file (H2H_SQL_2023.sql) into MySQL or SQLyog to set up the Invoices database.
- Implement API calls to establish communication between the frontend and backend functionalities.
- Integrate FLASK, a Python web framework, to enable AI support and prediction for the "Predict" button.

### High-Level Requirements:
- Develop an aesthetically pleasing and user-friendly UI with a well-structured layout, consisting of Header, Body, and Footer sections.
- The Body section should include subsections for Homepage, Add Data, Analytics View, Search, and Advance Search.
- The Homepage will display the grid containing essential invoice data, and users can edit, delete, or predict order amounts for selected invoices.
- The Add Data section will provide text fields and a Date Field to allow users to input new invoice details.
- Analytics View will present visually appealing bar graphs and pie charts to provide insightful data analysis.
- The Search functionality will allow users to search for specific invoices based on Customer Order ID, with results displayed below the Add Data section.
- Advance Search will offer a pop-up window with multiple text fields, allowing users to apply advanced search criteria.

### Overall Goal:
This project aims to create a robust, user-centric B2B invoice management system with AI capabilities, empowering users to efficiently manage, analyze, and predict invoice data through an intuitive web application interface.
