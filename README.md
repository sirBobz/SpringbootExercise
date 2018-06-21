## Springboot Web Api

This is a web based api project that helps solve three questions.

a) Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.

b) Given an index k, return the kth row of the Pascal's triangle

c) Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid. The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.


## Check Out and Build from Source

1. Clone the repository from GitHub:

		$ git clone https://github.com/sirBobz/SpringbootExercise.git 

2. Navigate into the cloned repository directory:

		$ cd SpringbootExercise

3. The project uses [Maven](http://maven.apache.org/) to build:

		$ mvn clean install
    
# To Use the service 

Testing the service on localhost. Pass JSON request 

I) For question 1 endpont is http://localhost:8080/api/v1/string-sort;
   
   
   Pass a JSON object as  { "string": "Ab,c,de!$" }

II) Question 2 endpoint is http://localhost:8080/api//v1/pascal-sort
  
  
  Pass a JSON object as  { "index": 2 }
   
III) Question 2 endpoint is http://localhost:8080/api//v1/isvalid-string
  
  
  Pass a JSON object as  { "string": "()[]{}" }
   
 In all cases responses will be returned back.
 
 
 
