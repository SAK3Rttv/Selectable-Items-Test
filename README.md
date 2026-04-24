# DemoQA Selectable Automation (Page Object Model)

This project demonstrates a professional **Page Object Model (POM)** implementation to automate complex UI interactions on the [DemoQA Selectable](https://demoqa.com/selectable) page.

## 🎯 Project Objectives
*   **POM Design**: Separation of locators/actions (`SelectablePage`) from test logic (`SelectableTest`).
*   **Dynamic State Verification**: Use of `.getAttribute("class")` to verify both active tabs and selected items.
*   **Prioritized Execution**: Sequential testing of List-based and Grid-based selection flows.

## 🏗️ Technical Architecture
### 1. `SelectablePage.java`
*   **Encapsulated Locators**: Uses precise XPaths combining text and class attributes (e.g., `contains(text(),'Dapibus') and contains(@class,'list-group-item')`).
*   **Verification Methods**: Includes boolean methods like `isListTabActive()` and `isSelectedItemInListActive()` to keep the test class clean.

### 2. `SelectableTest.java`
*   **Priority 1**: Validates that the List tab is active by default and ensures the item "Dapibus" transitions to an active state upon selection.
*   **Priority 2**: Automates the switch to the Grid tab, verifies the tab state change, and validates the selection of item "Three".

## 🚀 How to Run

### Installation & Cloning
```bash
git clone https://github.com/SAK3Rttv/Selectable-Items-Test.git
```

### Execution
1.  Open the project in **Eclipse**.
2.  Navigate to the `ch8_7` package.
3.  Right-click `SelectableTest.java` and select **Run As > TestNG Test**.

## 💻 Code Highlight
```java
// Advanced XPath combining multiple attribute checks
private By selectedItemInList = By.xpath(".//li[contains(text(),'Dapibus') and contains(@class,'list-group-item')]");

// Using POM methods for clear, readable assertions
Assert.assertTrue(selectablePage.isSelectedItemInListActive(), "Item not selected correctly!");
```

## 📁 Project Structure
- **Package**: `ch8_7`
- **Main Logic**: `SelectablePage.java`
- **Test Suite**: `SelectableTest.java`
- **Tools**: Selenium 4.x, TestNG, WebDriverManager.
