# Phone Selection Application

This Java program is an interactive console-based application to help users select a phone by choosing options for brand, model, storage variant, and color. It provides detailed information about the selected phone, including features and pricing.

## Features
- Allows users to choose whether they want to purchase a phone.
- Supports two brands: **Samsung** and **Apple**.
- Offers multiple models for each brand with specific pricing.
- Provides options to select storage variants and colors for the chosen phone.
- Displays detailed specifications and features of the selected phone.

## How to Use
1. **Run the Program**
   - Execute the `Phone` class in your Java IDE or terminal.

2. **Choose an Option**
   - The program prompts whether you want to purchase a phone. Select:
     - `1` or `yes` to proceed.
     - `2` or `no` to exit the program.

3. **Select a Brand**
   - Choose between:
     - `1` or `Samsung`
     - `2` or `Apple`

4. **Select a Model**
   - For Samsung, choose one of the following models:
     - Galaxy S22
     - Galaxy S10
     - Galaxy A34
   - For Apple, choose one of the following models:
     - iPhone 15 Pro
     - iPhone 16
     - iPhone 16 Plus

5. **Select a Storage Variant**
   - Options are provided based on the brand and model.

6. **Select a Color**
   - Options include common color choices for each brand.

7. **View Features**
   - The program displays a summary of the selected phone's features, specifications, and price.

## Example Interaction
1. **Prompt:**
   ```
   Do You Want a Phone?: 
   1. yes
   2. no
   ```
   **Input:** `1`

2. **Prompt:**
   ```
   Which phone do you want?: 
   1. Samsung
   2. Apple
   ```
   **Input:** `1`

3. **Prompt:**
   ```
   Which model of Samsung phone do you want?
   1. Galaxy S22
   2. Galaxy S10
   3. Galaxy A34
   ```
   **Input:** `2`

4. **Prompt:**
   ```
   Variants of Samsung phone:
   1. 142 GB
   2. 248 GB
   3. 506 GB
   ```
   **Input:** `1`

5. **Prompt:**
   ```
   Color of Samsung phone:
   1. Blue
   2. Multicolor
   3. Pink
   ```
   **Input:** `3`

6. **Output:**
   ```
   Features of your selected Samsung phone:
   Brand           : Samsung
   Model           : Galaxy S10
   Capacity        : 142 GB
   Color           : Pink
   Price           : ₹55000
   Screen Size     : 6.7-inch
   Battery         : 4,383mAh
   OS              : Android 13
   Camera          : 12MP camera
   Charger Available: Yes
   RAM             : 8 GB

   Thank you! Visit again.
   ```

## Requirements
- **Java Development Kit (JDK)**: Version 8 or higher
- **IDE**: Any Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans) or terminal with Java installed

## File Structure
- `Phone.java`: The main Java file containing the code for the phone selection application.

## Customization
- You can add more brands, models, or features by updating the respective sections in the code.
- Adjust pricing and specifications as required.

## License
This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT).
