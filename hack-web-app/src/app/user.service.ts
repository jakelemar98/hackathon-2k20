import { Injectable } from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http';
import {throwError} from 'rxjs';
import {catchError} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})

export class UserService {

  constructor(private http: HttpClient) { }

  gatewayURL = 'http://34.72.224.58/users/';

  private static handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error('An error occurred:', error.error.message);
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong,
      console.error(`Backend returned code ${error.status},` + `body was: ${error.error.body}`);
    }
    // return an observable with a user-facing error message
    return throwError(`There seems to be a problem: ${error.error.body}`);
  }

  getUserStatistics() {
    return this.http.get(this.gatewayURL + 'statistics').pipe(catchError(UserService.handleError));
  }

  getUserRoute() {
    return this.http.get(this.gatewayURL + 'trip').pipe(catchError(UserService.handleError));
  }

  getCommute() {
    // tslint:disable-next-line:max-line-length
    return this.http.get('https://roads.googleapis.com/v1/snapToRoads?path=41.592723,-93.614591%7C41.592666,-93.615643%7C41.591736,-93.615530%7C41.591254,-93.615315%7C41.590853,-93.615895%7C41.590652,-93.616754%7C41.590307,-93.616625%7C41.589738,-93.616443%7C41.589385,-93.617323%7C41.589072,-93.618901%7C41.588662,-93.621038%7C41.588197,-93.623314%7C41.587844,-93.624989%7C41.587386,-93.627061%7C41.587178,-93.627962%7C41.586905,-93.628909%7C41.586367,-93.628748%7C41.585701,-93.628501%7C41.585116,-93.628361%7C41.584987,-93.628952%7C41.584843,-93.629521%7C41.584698,-93.630272%7C41.584465,-93.631324%20&interpolate=TRUE&key=AIzaSyBEQgCxiGwGNRNiEp8PRcnxHVkKRq7Igmo')
      .pipe(catchError(UserService.handleError));
  }
}
