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
    return this.http.get(this.gatewayURL + 'stats').pipe(catchError(UserService.handleError));
  }

  getUserRoute() {
    return this.http.get(this.gatewayURL + 'route').pipe(catchError(UserService.handleError));
  }
  
  getMultipleRoutes() {
    return this.http.get(this.gatewayURL + 'routes').pipe(catchError(UserService.handleError));
  }
}
