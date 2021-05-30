import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { AppConstants } from 'src/app/fnd/common/app.constants';
import { Teacher } from './teacherEntity';

@Injectable({
  providedIn: 'root'
})
export class TeacherService {

  // Define API
  apiURL = AppConstants.API_URL + 'daham/teacher';

  
  constructor(private http: HttpClient) { }

  // Http Options
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  getAll(): Observable<Teacher> {
    return this.http.get<Teacher>(this.apiURL)
      .pipe(
        retry(1),
        catchError(this.handleError))
  }

  // HttpClient API get() method => Fetch employee
  get(id: string): Observable<Teacher> {
    return this.http.get<Teacher>(this.apiURL + '/' + id)
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
