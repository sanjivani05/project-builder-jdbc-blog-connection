![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Lab | Blog - Stage 1

Remember your client Mr. Alex? 

Well, he loves your work and is back again for your help. He's reworking on the same project with the help of databases. Can you look into his requirements & sort things out?


## What Should You Do
```
Fork this repo
Clone this repo
Practice Java JDBC - connections, class and object
```

## How To Submit
```
Upon completion, run the following commands:

git add .
git commit -m "ProGrad ID"
git push origin master

And finally, create a pull request so your ProGrad Mentor (PM) can review your work.
```

## Instructions

1. ***Do not modify the entire code.***
2. ***Edit the code as per the instructions.***
3. ***Go to Java Resources -> src folder.***
4. ***You will have two packages src/controller and src/utility.***
5. ***Your database connection code should exist inside the utlity package.***
6. ***Once the progressions are completed follow the instructions to run the application and test your code.***
7. ***Add appropriate jars to your project directory.***
8. ***To add dependencies, right click on your project - select build path - configure build path - select libraries tab - select add external jars and add the downloaded jar files.***

## Requirements
Download ojdbc6.jar from the given link [https://www.oracle.com/database/technologies/jdbcdriver-ucp-downloads.html]

## Progression 0:
1. ***Right click on src folder and select new - file and name it as jdbc.properties.***
2. ***You can use the jdbc properties given below in the NOTE section.***

## Progression 1:
1. **Create a class called as `ConnectionManager` inside the utility package.**
2. **Create a method public static Connection getConnection() which returns a connection object.** 
3. **Use the method public static Properties loadPropertiesFile() to load the jdbc properties from the jdbc.properties file.**

## Progression 2:
1. **Go to src controller - SignUpController.**
2. **Inside the doGet method create an object for the Connection { java.sql.Connection }.**
3. **Call the getConnection() method in the ConnectionManager and store the return value in the Connection object.**
4. **Display in the console "Connection established",if the connection is not equal to null else display "Check your connection" in the console.**

### Note:

Use the below code to retreive the connection details from jdbc.properties to establish connection
```
public static Properties loadPropertiesFile() throws Exception {
	Properties prop = new Properties();	
	InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
	prop.load(in);
	in.close(); 
	return prop;
}
```
Create a file called as jdbc.properites. To create a file right click on the application - new - file - name the file as jdbc.properties.
```
jdbc.properties
#JDBC properties entry for MYSQL server
driver = oracle.jdbc.OracleDriver
url=jdbc:oracle:thin:@localhost:1521:xe
username=your_username
password=your_password

```

**Sample Output**

```Connection established```

**Sample Output**

```Check your connection```
