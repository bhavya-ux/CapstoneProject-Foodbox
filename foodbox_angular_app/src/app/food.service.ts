import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FoodService {

  private url:string;

  constructor(private http:HttpClient) {
    this.url = "http://localhost:8080/foodbox_crud_rest_Api";
    
   }
  public getrestaurants()
  {
    return this.http.get(this.url + "/restaurant");
  }
  public searchrestaurantbylocation(restaurantLocation:any)
  {
    return this.http.get(this.url + "/restaurant/",restaurantLocation)
  }
  public addrestaurant(restaurant)
  {
    return this.http.post(this.url+"/restaurant",restaurant);
  }
  public searchmenu(menuItemName : any)
  {
    return this.http.get(this.url+"/menu/",menuItemName);
  }
  public searchorder()
  {
    return this.http.get(this.url+"/order");
  }
  public login(username:any,userpassword:any)
  {
    return this.http.get(this.url+"/user/"+username+"/"+userpassword);
  }
  public register(details)
{
  return this.http.post(this.url,details);
}
}

