import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { AppConstants } from 'src/app/fnd/common/app.constants';
import { Dahampasala } from './dahampasalaClass';

@Injectable({
  providedIn: 'root'
})
export class DahampasalaService {

  // Define API
  apiURL =  AppConstants.API_URL + 'daham/dahampasala';


  constructor(private http : HttpClient) { }

    // Http Options
    httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    } 

    getAll(): Observable <Dahampasala> {
      return this.http.get<Dahampasala>(this.apiURL)
      .pipe(
      retry(1),
      catchError(this.handleError))
    }

    // HttpClient API get() method => Fetch employee
  get(id:string): Observable<Dahampasala> {
    return this.http.get<Dahampasala>(this.apiURL + '/' + id)
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }  

  // HttpClient API post() method => Create employee
  create(dahampasala : Dahampasala): Observable<Dahampasala> {
    return this.http.post<Dahampasala>(this.apiURL, JSON.stringify(dahampasala), this.httpOptions)
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }  

  // HttpClient API put() method => Update employee
  update(id : number, dahampasala : Dahampasala): Observable<Dahampasala> {
    return this.http.put<Dahampasala>(this.apiURL + '/' + id, JSON.stringify(dahampasala), this.httpOptions)
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }

  // HttpClient API delete() method => Delete employee
  delete(id : string){
    return this.http.delete<Dahampasala>(this.apiURL + '/' + id, this.httpOptions)
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }

    // Error handling 
  handleError(error: any) {
    let errorMessage = '';
    if(error.error instanceof ErrorEvent) {
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
