package main

import (
	"encoding/json"
	"io/ioutil"
	"log"
	"net/http"
)

func getRoute(coordinates string) string {
	log.Println("Retriving Route...")
	var returnVal string
	url := apiBase + coordinates + " &interpolate=TRUE&key=" + apiKey
	response, err := http.Get(url)

	return response
}