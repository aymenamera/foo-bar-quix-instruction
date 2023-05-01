import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {
 url= "http://localhost:8080/foo-bar-quix/";
   constructor(private http:HttpClient) { }


   convertNumber(input) {
   return this.http.get(this.url+input).pipe(
                                      map((res) => {return res; }),
                                  );
 }

}
