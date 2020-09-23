import { Component, OnInit } from '@angular/core';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-searchmenu',
  templateUrl: './searchmenu.component.html',
  styleUrls: ['./searchmenu.component.css']
})
export class SearchmenuComponent implements OnInit {
  private menuItemresponse;
  private menuItemName;

  constructor(private menu : FoodService) { }

  ngOnInit() {
this.searchmenu();
  }
  searchmenu()
  {
    this.menu.searchmenu(this.menuItemName).subscribe(response=>{
      this.menuItemresponse = response;
      console.log('response is = ', this.menuItemresponse)
    },
    error=>{
     console.log('error is=',error)
   })
  }
  }





