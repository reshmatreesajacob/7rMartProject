# 🛒 7rMartProject – E-commerce Website Automation

**Technologies Used:**  
Java · Selenium WebDriver · TestNG · Maven  
**Design Pattern:** Page Object Model (POM) with PageFactory  
**Framework:** TestNG  
**Automation Tool:** Selenium with Java  
**Live Application:** [Grocery App Admin Panel](https://groceryapp.uniqassosiates.com/admin/login)

---

## 📌 Project Overview

This project automates the end-to-end test scenarios of the 7rmart supermarket admin panel. It utilizes the Page Object Model (POM) design pattern with PageFactory to enhance modularity, code reusability, and maintainability. The suite is data-driven and includes custom utilities for reporting, waits, data generation, and more.

---

## 📁 Project Structure

### `src/main/java`

**Packages:**
- **`constants`**
  - `Constants`: Stores fixed values
  - `Messages`: Stores expected messages for assertions
- **`pages`**
  - `LoginPage`, `HomePage`, `AdminUserPage`, `ManageNewsPage`, `SubcategoryPage`
  - Define WebElements using `@FindBy` and encapsulate actions/assertions for respective pages
- **`utilities`**
  - `ExcelUtility`: Reads test data from Excel files
  - `FakerUtility`: Generates random dynamic test data
  - `PageUtility`: Encapsulates common UI actions (click, input, dropdown, etc.)
  - `WaitUtility`: Handles explicit waits
  - `ScreenshotUtility`: Captures screenshots on test failure
  - `ExtentReportUtility`: Generates HTML reports

---

### `src/main/resources`

- **`Config.properties`**: Stores project configuration like application URL

---

### `src/test/java`

**Packages:**
1. **`automationCore`**
   - `Base`: Initializes browser, handles setup/teardown, captures screenshots on failure
2. **`testscript`**
   - Contains test cases:
     - `LoginTest`, `HomeTest`, `AdminUsersTest`, `ManageNewsTest`, `SubcategoryTest`
3. **`retry`**
   - `Retry`: Implements logic to rerun failed test cases
4. **`listeners`**
   - `Listeners`: Implements TestNG listeners for logging, retry logic, and reporting

---

### `src/test/resources`

- Contains test data and media assets used during test execution

---

## ✅ Modules Automated

### 🔐 Login Module
- Valid and invalid login attempts (data-driven via Excel)
- Authentication message validations

### 🏠 Home Module
- Verifies logout functionality on home page

### 👥 Admin Users Module
- Add, edit, search, and refresh admin users

### 📰 News Management
- Create news items, search, and refresh using dynamic data

### 🗂️ Subcategory Management
- Validate subcategory creation, editing, listing, and page refresh

---

## 🧪 Test Execution Strategies

- `testng.xml` for suite control
- Supports:
  - Parallel execution (`paralleltestng`)
  - Cross-browser testing (`crossbrowsertestng`)
  - Grouping (`groupingtestng`)
  - Multi-browser configuration (`multibrowsertestng`)

---

## 📊 Reporting

- Custom HTML reports generated using ExtentReports
- Screenshots captured for failed test steps
- Retry mechanism in place to rerun failed tests automatically

---

## 🚀 Getting Started

1. Clone this repository
2. Import into IntelliJ IDEA or Eclipse
3. Update the `Config.properties` with your URL if needed
4. Use `testng.xml` to run desired test cases
5. Execute tests using Maven or directly through TestNG

---



