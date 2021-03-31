import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdvertisementServiceService {
  
   adsArray =[
    {title:"test",name:"test",category:"Furniture",discription:"this is test"},
    {title:"test",name:"test1",category:"Furniture",discription:"this is test"},
    {title:"test",name:"test2",category:"Furniture",discription:"this is test"},
    {title:"test",name:"test3",category:"Furniture",discription:"this is test"}
  ]
  constructor() { }

  getAllAdvertises(){
    return this.adsArray;
  }

  deleteAdvertise(adsObj){
        for(let i=0;i<this.adsArray.length;i++){
          if(this.adsArray[i].name=== adsObj[i].name){
            adsObj.pop();
          }
        }
        return this.adsArray;
  }

  updateAdvertise(adsObj){
    for(let i=0;i<this.adsArray.length;i++){
      if(this.adsArray[i].name=== adsObj.name){
        adsObj[i] = adsObj;
      }
    }
    return this.adsArray;
  } 

  getAdvertise(name){
    console.log(name)
    for(let i=0;i<this.adsArray.length;i++){
      if(this.adsArray[i].name===name){
        let obj =[];
        obj.push(this.adsArray[i]);
        return obj;
      }
    }
   return null;
    
  } 
}
