#!/bin/sh
mongoimport -d=geo -c=cities -u=$MONGO_INITDB_ROOT_USERNAME -p=$MONGO_INITDB_ROOT_PASSWORD --authenticationDatabase admin --file /tmp/geo/cities.json --jsonArray
