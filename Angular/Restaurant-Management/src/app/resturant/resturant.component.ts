import { Component, OnInit,ViewChild } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';



@Component({
  selector: 'app-resturant',
  templateUrl: './resturant.component.html',
  styleUrls: ['./resturant.component.css']
})
export class ResturantComponent implements OnInit {
  
  public click=true;
  
  constructor(private route:ActivatedRoute, private router:Router) { }

  ngOnInit(): void {
  }
  
  resturant1(){
    this.click=false;
    this.router.navigate(['restaurant1'])
  }  
  resturant2(){
    this.click=false;
    this.router.navigate(['restaurant2'])
  } 
  resturant3(){
    this.click=false;
    this.router.navigate(['restaurant3'])
  } 
}
