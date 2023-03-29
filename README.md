# API cities ru

run: `docker compose up --build`  
stop: `docker compose down -v`

Data get from Overpass API

`http://localhost:8080/api/v1/cities?query={string}` - get list cities name start with string  
`http://localhost:8080/api/v1/cities/{id}` - get city by id
