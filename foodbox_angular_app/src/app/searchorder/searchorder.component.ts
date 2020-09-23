import { Component, OnInit } from '@angular/core';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-searchorder',
  templateUrl: './searchorder.component.html',
  styleUrls: ['./searchorder.component.css']
})
export class SearchorderComponent implements OnInit {
  private orderIdresponse

  constructor(private order : FoodService) { }

  ngOnInit() {
    this.searchorder();
  }
  searchorder()
  {
    {
      this.order.searchorder().subscribe(response=>{
        this.orderIdresponse = response;
        console.log('response is = ', this.orderIdresponse)
      },
      error=>{
       console.log('error is=',error)
     })
     }
  }

}

