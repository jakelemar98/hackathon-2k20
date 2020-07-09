package main

import (
	"encoding/json"
	"io/ioutil"
	"log"
	"net/http"
)

type Body struct {
	Location map[string]string `json:"location"`
	OriginalIndex int `json:"originalIndex"`
	PlaceId string `json:"placeId"`
}

type SnappedPoints struct {
	Points []map[string]interface{}  `json:"snappedPoints"`
}


// type Watching struct {
// 	ID     primitive.ObjectID `json:"id" bson:"_id"`
// 	User   string             `json:"user" bson:"user"`
// 	Stocks []string           `json:"stocks" bson:"stocks"`
// }

// type GlobalQuote struct {
// 	Stock map[string]string `json:"Global Quote"`
// }


func getRoute(coordinates string) string {
	log.Println("Retriving Route...")
	var returnVal string
	url := apiBase + coordinates + "&interpolate=TRUE&key=" + apiKey
	log.Println(url)
	response, err := http.Get(url)
	if err != nil {
		return "null"
		log.Fatalf("server error -> %s\n", err)
	} else {
		defer response.Body.Close()
		data, _ := ioutil.ReadAll(response.Body)
		log.Println(response.Body)
		var r SnappedPoints
		log.Println(r)
		err = json.Unmarshal(data, &r)
		if err != nil {
			log.Println("Yeh theres an error")
			log.Fatal(err)
		}

		jsonString, _ := json.Marshal(r)
		returnVal = string(jsonString)
	}
	return returnVal
}