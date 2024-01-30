# E-Commerce Based Backend Application

## Project Description
E-Commerce Based Backend Application is a REST API developed using the Spring Boot framework. The project comprises several modules catering to user, admin, categories, products, cart, and orders. Users can register, login, browse products, add them to cart, and place orders. Admins have additional privileges such as managing categories, products, and orders.

## Modules

### User Module
- **Register User:** Allows users to create an account.
- **Login:** Enables users to authenticate themselves.
- **Upload User Image:** Provides functionality to upload user images.
- **Normal User Fetching Admin URL:** Allows normal users to fetch admin URLs.

### Admin Module
- **Login:** Allows admins to authenticate themselves.

### User Module APIs
1. Get all users
2. Get user by ID
3. Get user by email
4. Delete user
5. Update user

### Category Module
- **Admin Authorization:** Only admins can access this module.
1. Get all categories
2. Save category
3. Update category
4. Get by title
5. Delete category

### Product Module
- **Admin Authorization:** Only admins can access this module.
1. Add product along with category
2. Add product image
3. Get all products
4. Get product by ID
5. Delete product
6. Update product

### Cart Module
- **User Authorization:** Only authenticated users can access this module.
1. Add item to cart
2. Get user's cart
3. Remove item from cart
4. Clear cart
5. Update cart

### Order Module
1. Create order
2. Get order details of user
3. Get all orders
4. Cancel order
5. Update order

## Working of Project
- Users register and sign in, accessing the application as either a user or an admin.
- Admins manage products and categories via CRUD operations.
- Users add products to their carts and place orders.
- Admins have access to order information.

## Database Mapping
- User-Role mapping: One user can have multiple roles.
- Category-Product mapping: One category can have multiple products.
- Cart-User mapping: Each user has one cart to store product items.

## Functionality Implemented
- Pagination and Sorting: Data is displayed in paginated form and can be sorted.
- Bean Validation: Prevents entry of incorrect data.
- Global Exception Handling: Custom exceptions are handled globally.
- File Uploading Service: Allows users and admins to upload images/files.

## Authentication and Authorization
- JWT Token Concept: Authentication is handled using JWT tokens.
- Token Validation: Authentication filter validates tokens with each request.

