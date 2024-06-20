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

- System Architecture
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/cc359e90-02a7-4257-869a-50744d147c04)

- Application Workflow
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/16d10b71-0147-4c94-b501-57a03c03fd3c)


- User Registration 
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/61b4cc35-9747-463e-b909-d5864e243da2)


- User Login 
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/ec9c761b-9b10-43ac-b35c-1f586fefb511)


- Upload User Image
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/810bb9f0-37a7-4dcf-bd97-cb1d098af77b)



- Admin Urls
- ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/2b809889-fc35-4903-a03c-54d095451964)



- Category Module
- Add Category
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/80ab56ba-850e-4d15-8993-1ea2548c8a20)

- Get Category by title
 ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/c99709ea-2f0c-4c11-a35a-97d5fd0a9f09)

- Update category
 ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/92172856-728e-4d91-959d-fa110ae09429)


- Delete category
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/a1f6463f-0b19-471a-8a3d-6f1fb5bb496d)


- Product Module

- Add product along with category
 ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/130ad20a-5b86-4846-a878-7e91eab46263)



- Get all product
![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/40a6583b-51f8-4141-b594-112cbc8dd7c5)




- Update Product
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/821b8cc2-22ab-47b3-b257-7272d0df7eed)


- Delete product
 ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/2156277e-7a5c-4e0a-a321-4a99460980a7)

- Cart Module(User has authority to access urls)

- Add item to cart
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/c21c3b09-1264-4de6-a5a8-2cbfd1e936a0)



- Update cart
 ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/8134ded0-4796-4edd-b7e1-278fdd6345dd)


- Clear cart
 ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/9014ea8a-3e05-40a1-9d4b-2d7d76205c28)


- Order Module(User has authority to access urls)
- Create order
 ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/a4d5ae9a-a481-494d-8bb0-7c5b97fbba95)

  
- Get order details
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/56e17a76-04a0-4f43-a14d-a2fa9ef03a7c)

- Cancel order
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/aab7d098-bbbc-46b2-af21-c397c785edb5)

- Target Group
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/cd24cdc2-4172-485e-8f6a-d615d3812270)

- Load Balancer
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/29594a5b-5473-407b-a446-066ae4a8b86a)

- Security Group
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/0c6981be-9b97-4e1b-8647-c882fb733977)

- Result Graph
  ![image](https://github.com/Yashwant369/Stationery-Store/assets/71956889/800a843f-dd2f-4fb8-a045-e3677416b728)




**Made by [Yashwant369](https://github.com/Yashwant369)**
