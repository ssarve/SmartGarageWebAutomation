# SmartGarage Web Automation Framework

This is a robust and scalable Selenium-based automation framework for testing the SmartGarage web application (https://uat.mysmartgarage.in/).

## 🔧 **Tech Stack**
- **Language**: Java
- **Automation Tool**: Selenium WebDriver
- **Test Runner**: TestNG
- **Build Tool**: Maven
- **Reporting**: ExtentReports (with pass/fail screenshots)
- **Design Pattern**: Page Object Model (POM)

## ✅ **Features**
- Clean POM structure for easy maintenance
- Login flow using mobile number and OTP
- Homepage validations: logo, banner, menu
- Screenshot capture for pass/fail scenarios
- Extent HTML reports auto-generated
- Ready for GitHub/Jenkins CI integration

## 📁 **Project Structure**
SmartGarageWebAutomation/
├── pom.xml
├── testng.xml
├── extent.html
├── screenshots/
├── src/
│ ├── main/
│ │ └── java/
│ │ ├── pages/
│ │ └── utils/
│ └── test/
│ └── java/
│ └── tests/


## 🚀 **How to Run**
1. Clone the repo:
   ```bash
   git clone https://github.com/ssarve/SmartGarageWebAutomation.git
Import it into Eclipse or IntelliJ as a Maven project.

Run tests using:

testng.xml file

Or directly via LoginTest.java

📸 **Reporting**
extent.html: generated in root after test execution

Screenshots saved in /screenshots folder

🔐 **Credentials for Testing**
Mobile: 1234567890

OTP: 197360

📬 **Author**
Sachin Sarve
GitHub Profile - https://github.com/ssarve
