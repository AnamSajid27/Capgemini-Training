import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { MenuServiceService } from './menu-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  userState=false;
  constructor(private router:Router,private dialog:MatDialog, private menuService: MenuServiceService){}
  onRest1(){
         this.router.navigate(["restaurant"])
  }
  onHome(){
    this.router.navigate(["restaurant"]);
  }

  onMenu(){
    this.router.navigate(['menu'])
  }

  role ="user";
  success=true;
  //logoutState=false;
  login(){
    const dialogRef = this.dialog.open(LoginComponent);
    dialogRef.afterClosed().subscribe(result =>{
      this.role=result.data;
      if(this.role==="admin"){
        this.success=false;
        this.menuService.UpdateAdminState(true);
        this.router.navigate(['admin'])
      }
      if(this.role==="owner" ){
        this.success=false;
        this.menuService.UpdateOwnerState(true);
        this.router.navigate(['restaurant'])
      }
    })

  }

  logout(){
    this.success=true;
    this.menuService.UpdateAdminState(false);
    this.router.navigate(["restaurant"])
    
  }
}
