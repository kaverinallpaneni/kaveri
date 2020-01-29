import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactusComponent } from './contactus/contactus.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { SearchComponent } from './search/search.component';


const routes: Routes = [
  { path:"", redirectTo : "home", pathMatch: "full"},
  { path:"home",component:HomeComponent},
{path:"contactus",component:ContactusComponent},
{path:"aboutus",component:AboutusComponent},
{path:"search/:searchText",component:SearchComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule{}
