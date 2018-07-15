# Spring-Data-Rest

Steps:

Open the terminal and type:

```sh
$ git clone https://github.com/jpjavagit/Spring-boot-data-rest.git
$ mvn clean install
$ mvn spring-boot:run
```

* Be sure the Maven is installed. 

I have worked with Postman to run the Rest calls, but you`re free to choose your preference tool.

In this project is being used H2 database

To run some inserts:

```sh
{
	"name":"bigmac",
	"price":12.00
}

{
	"name":"whooper",
	"price":11.00
}

{
	"name":"x-bacon",
	"price":8.00
}
```

To get it:

localhost:8080/burger/search/findByName?name=bigmac
localhost:8080/burger/search/findByName?name=whooper
localhost:8080/burger/search/findByName?name=x-bacon








