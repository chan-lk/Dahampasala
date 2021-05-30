import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { AppConstants } from 'src/app/fnd/common/app.constants';
import { Address } from './addressEntity';

@Injectable({
  providedIn: 'root'
})
export class AddressService {

  // Define API
  apiURL =  AppConstants.API_URL + 'daham/address';


  constructor(private http: HttpClient) { }

  // Http Options
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  getAll(): Observable<Address> {
    return this.http.get<Address>(this.apiURL)
      .pipe(
        retry(1),
        catchError(this.handleError))
  }

  // HttpClient API get() method => Fetch employee
  get(id: string): Observable<Address> {
    return this.http.get<Address>(this.apiURL + '/' + id)
      .pipe(
        retry(1),
        catchError(this.handleError)
      )
  }

  // Error handling 
  handleError(error: any) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      // Get client-side error
      errorMessage = error.error.message;
    } else {
      // Get server-side error
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    window.alert(errorMessage);
    return throwError(errorMessage);
  }

}