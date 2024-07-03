# Shopping-Cart-Application
Shopping Cart Application
Project Description
This project implements a simple console-based shopping cart application. Users can interact with the application to view available products, add products to their cart, remove products from their cart, view their cart, and proceed to checkout.

File Structure
Main.java: The main entry point of the project, responsible for starting the application.
Product.java: Represents a product with a name and price.
Shoppingcart.java: Manages the shopping cart, allowing products to be added, removed, and viewed.
Store.java: Simulates the store, manages the list of products, and handles user interactions.
Prerequisites
Java Version: JDK 8 or higher
How to Run
Place all .java files (Main.java, Product.java, Shoppingcart.java, Store.java) in the same directory.
Compile the Java files using the following command:
sh
Copy code
javac Main.java Product.java Shoppingcart.java Store.java
Run the program using the following command:
sh
Copy code
java Main
Code Overview
Main.java
This file is the entry point of the program. Its main functions include:

Initializing the store.
Starting the application and displaying the menu.
Product.java
This file represents a product in the store. Its main functions include:

Defining the attributes of a product (name and price).
Providing methods to retrieve the product's name and price.
Shoppingcart.java
This file manages the shopping cart. Its main functions include:

Adding products to the cart.
Removing products from the cart.
Viewing the contents of the cart.
Calculating the total price of the cart.
Store.java
This file simulates the store and manages user interactions. Its main functions include:

Initializing the list of available products.
Displaying the menu and handling user input.
Viewing available products.
Adding and removing products from the cart.
Checking out and resetting the cart.
Sample Output
After running the program, it will display a menu with options for the user to interact with the store. The user can choose to view products, add or remove products from the cart, view the cart, or checkout. The application will respond to the user's choices and provide appropriate feedback.
