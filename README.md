# MongGo
몽고DB/ Insert + List

use db01
db.user_data.drop()
db.user_data.insertOne({ 'id':'20', 'name':'김지훈', 'address':'인천'})
use admin
db.createUser( { user: "root2", pwd: "1234", roles: ["root"] })


## mongodb
spring.data.mongodb.authentication-database: admin
spring.data.mongodb.username=root2
spring.data.mongodb.password=1234
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=db01
