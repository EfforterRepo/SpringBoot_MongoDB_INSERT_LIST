# MongGo
몽고DB/ Insert + List

use db01
db.user_data.drop()
db.user_data.insertOne({ 'id':'20', 'name':'김지훈', 'address':'인천'})
use admin
db.createUser( { user: "root2", pwd: "1234", roles: ["root"] })
