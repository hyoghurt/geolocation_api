db.createUser({user: process.env.MONGO_INITDB_APP_USERNAME, pwd: process.env.MONGO_INITDB_APP_PASSWORD, roles : [{role: "readWrite", db: "geo"}]});
