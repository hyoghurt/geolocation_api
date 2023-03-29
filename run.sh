#!/bin/sh
p="$1"

if [ -z $p ]; then
  echo "./run.sh down OR ./run.sh start"
elif [ $p = "start" ]; then
  echo "docker compose up"
  docker compose -f ./docker-compose.yml up --build
elif [ $p = "down" ]; then
  echo "docker compose down -v"
  docker compose -f ./docker-compose.yml down -v
fi