# Employee-Directory-Spring-Boot
Creating an API for Employee Directory with all HTTP calls, Advices, logging, etc in Spring Boot

## Adding Department Database
1. Here for the purpose of a basic sample project i have used H2 database
2. To create the database table we use ORM, and annotated our Department class with @Enitity and also set the department id using @Id which will be auto generated
3. Then i created a one to many relationship inside the department entity(since there can be many employees in one department) and i did so using the @OneToMany annotation

## Adding Employee Database
1. Here we used H2 database as well
2. To create the database table we use ORM, and annotated our Employee class with @Enitity and also set the employee id using @Id which will be auto generated using @GeneratedValue and @SequenceGenerator
3. Then i created a many to ont relationship inside the employee entity and made the department as the foreign key using @ManyToOne & @JoinColumn(foreignKey = @ForeignKey(name="dept_id"),name="dept_id")

## Creating Controllers
1. I created all the controllers for both the Department and Employee enitity using @PostMapping,@GetMapping,@DeleteMapping,@PutMapping and annotated the controller with @RestController
2. Created all the methods to perform operations in the Employee database:
    * addEmployee
    * addEmployees
    * getEmployee
    * getEmployees
    * updateEmployee
    * deleteEmployees
3. Created all the methods to perform operations in the Department database:
    * addDepartment
    * addDepartments
    * fetchDepartmentList
    * fetchDepartments
4. Created Repository both for Employee and Department that extends JpaRepository
5. Created a service class both for employee and departments which the controller will call to execute any get,put,post or delte operation
6. Added @Before, @After, @AfterThrowing, @AfterReturning, @Around functions, to run when the EmployeeService functions are called

  
