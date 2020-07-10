package main

import (
	"io/ioutil"
	"log"
)

// type Body struct {
// 	Location map[string]string `json:"location"`
// 	OriginalIndex int `json:"originalIndex"`
// 	PlaceId string `json:"placeId"`
// }

type SnappedPoints struct {
	Points []map[string]interface{} `json:"snappedPoints"`
}

func getRoute() string {
	content, err := ioutil.ReadFile("path2.txt")
	if err != nil {
		log.Fatal(err)
	}

	// Convert []byte to string and print to screen
	text := string(content)
	return text
}

func getRoutes(coordinates string) string {
	log.Println("Retriving Route...")
	content, err := ioutil.ReadFile("path3.txt")
	if err != nil {
		log.Fatal(err)
	}

	// Convert []byte to string and print to screen
	text := string(content)

	return text
}
