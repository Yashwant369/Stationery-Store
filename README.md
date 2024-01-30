# E-Commerce Based Backend Application

## Project Description
E-Commerce Based Backend Application is a REST API developed using the Spring Boot framework. The project comprises several modules catering to user, admin, categories, products, cart, and orders. Users can register, login, browse products, add them to cart, and place orders. Admins have additional privileges such as managing categories, products, and orders.

## Tech Stack
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL
- Spring Security

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
- **User Authorization:** Only authenticated users can access this module.
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

## Screenshots
- User Registration 
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/97246d00-a1bc-4ad1-830c-6bd5866bdd3f)

- User Login 
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/b3a68b1a-cec4-4d13-9e03-a800f57ccfd6)

- Upload User Image
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/08d5e6e2-5ea7-46fe-9273-85b2ffc1e109)

- Normal User fetching Admin Url
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/10f9ae47-b173-42f9-ad88-911aaf751eb5)

- Admin Urls

- Login
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/b3323431-d78c-40d6-9e71-04f866b458f7)

- Get all users
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/dca7b651-8031-4abf-843b-a42f9b8b8e4c)

- Get user by id
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/8313b9a6-de45-459b-82c7-31096cbd20b1)

- Get user by email
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/4cc267ef-978c-4a9c-bd9e-906e83a06762)

- Delete user
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/b818a241-86b6-465c-a6cb-8a66c8d788ff)

- Update user
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/69bea91d-2e0a-43cf-b1cb-2c1785a9351e)

- Category Module
- Add Category
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/3ec54400-a26c-4713-b53e-ce9f5a05f125)

- Get Category by title
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/f629b1c2-91b0-41ee-ac7b-d28039b1da36)

- Get all category
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/eda66d89-3b57-4254-94f3-9e3930712247)

- Update category
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/313cf7a4-0e7a-4545-ab32-64b55e6959c9)

- Delete category
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/dcdca08a-ec76-43cf-9c51-d4575ccfc55a)

- Product Module

- Add product along with category
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/975770a6-15f4-48dd-8b14-6fabf2bd9b9e)

- Upload product image
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/e192170f-3a06-4b2a-a35a-5a8f2a53dd0e)

- Get all product
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/07c3e352-2d92-491f-803c-464bffe7d68e)

- Get product by id
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/f969286a-d62e-42ad-8a1b-4bcf347e532b)

- Update Product
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/c7a03c9d-f9e5-4114-976d-3fd709767a6d)

- Delete product
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/737963dd-47d2-499a-97ca-fad153b08d15)

- Cart Module(User has authority to access urls)

- Add item to cart
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/557e36f2-5266-4e5f-b213-f36773aa7840)

- Remove item from cart
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/9935432e-3e23-4e42-9ef0-6831ea8ff0a0)

- Update cart
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/0601abb5-cd5e-4c4c-98f2-f39e9012d80d)

- Clear cart
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/ee1683a8-8fe3-4ac9-b66a-e6b3bda15700)

- Get cart of user
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/bcb6b4d0-8257-43d5-a006-9f90fb278ba4)

- Order Module(User has authority to access urls)
- Create order
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/8920e3f1-18c6-43ab-b543-dd4bf6febbd5)
  
- Get order details
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/121be084-8095-4dc2-9cc9-cd05b3ff0c92)

- Get all orders
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/f481359e-0512-4eda-8c83-5fc698cd17ed)

- Update Order
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/44a8d367-8d35-4af2-81cc-4c9147d04b35)

- Cancel order
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/264fd0c8-d21b-4f44-9bde-23358d47e729)

**Made by [Yashwant369](https://github.com/Yashwant369)**
