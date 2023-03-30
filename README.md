# API cities ru

run: `docker compose up --build`  
stop: `docker compose down -v`

GET list cities  
`http://localhost:8080/api/v1/cities?query={string}`  
required param query - city name start with string (ignore case)

GET city by id  
`http://localhost:8080/api/v1/cities/{id}`  

### Example response
```
{
    "_id": 26878551,
    "lat": 67.151442,
    "lon": 32.4130551,
    "region": "Мурманская область",
    "name_en": "Kandalaksha",
    "name_ru": "Кандалакша",
    "official_status": "город"
}
```

Data get from Overpass API
