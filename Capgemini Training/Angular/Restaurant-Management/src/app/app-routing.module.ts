import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { MenuComponent } from './menu/menu.component';
import { ResturantComponent } from './resturant/resturant.component';
import { Resturant1Component } from './resturant1/resturant1.component';
import { Resturant2Component } from './resturant2/resturant2.component';
import { Resturant3Component } from './resturant3/resturant3.component';

const routes: Routes = [
  {path:'',redirectTo:'/restaurant',pathMatch:'full'},
  {path:'admin',component:AdminComponent},
  {path:'menu',component:MenuComponent},
  {path:'restaurant',component:ResturantComponent},
  {path:'restaurant1',component:Resturant1Component},
  {path:'restaurant2',component:Resturant2Component},
  {path:'restaurant3',component:Resturant3Component},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
