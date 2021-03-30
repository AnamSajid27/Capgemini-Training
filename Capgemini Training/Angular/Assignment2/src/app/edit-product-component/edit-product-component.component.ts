import { Component, Inject, Input, OnInit, Optional, ViewChild } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { adsModel } from '../adsModel';

@Component({
  selector: 'app-edit-product-component',
  templateUrl: './edit-product-component.component.html',
  styleUrls: ['./edit-product-component.component.css']
})
export class EditProductComponentComponent implements OnInit {
  action:string;
  local_data:any;
  

  constructor(
    public dialogRef: MatDialogRef<EditProductComponentComponent>,
    //@Optional() is used to prevent error if no data is passed
    @Optional() @Inject(MAT_DIALOG_DATA) public data: adsModel) {
    console.log(data);
    this.local_data = data;
    this.action = this.local_data.action;
  }

  ngOnInit(): void {
  }

  doAction(){
    console.log(this.local_data)
    this.dialogRef.close({event:this.action,data:this.local_data});
  }

  closeDialog(){
    this.dialogRef.close({event:'Cancel'});
  }
  
}