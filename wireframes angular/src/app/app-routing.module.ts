import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UploadmediaComponent } from './media/uploadmedia/uploadmedia.component';
import { MymediaComponent } from './media/mymedia/mymedia.component';
import { FollowersComponent } from './media/followers/followers.component';
import { AccountComponent } from './media/account/account.component';
import { LoginComponent } from './auth/login/login.component';
import { RegisterComponent } from './auth/register/register.component';
import { SinglemediaComponent } from './singlemedia/singlemedia.component';
import { MultiplemediaComponent } from './multiplemedia/multiplemedia.component';
import { BlockedusersComponent } from './blockedusers/blockedusers.component';
import { AccountupdateComponent } from './accountupdate/accountupdate.component';



const routes: Routes = [
  {path:"", redirectTo: "login",pathMatch:"full"},
  {path:"uploadmedia",component:UploadmediaComponent},
  {path:"mymedia",component:MymediaComponent},
  {path:"followers",component:FollowersComponent},
  {path:"account",component:AccountComponent},
  {path:"login",component:LoginComponent},
  {path:"register",component:RegisterComponent},
  {path:"singlemedia",component:SinglemediaComponent},
  {path:"multiplemedia",component:MultiplemediaComponent},
  {path:"blockedusers",component:BlockedusersComponent},
  {path:"accountupdate",component:AccountupdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]

})
export class AppRoutingModule { }
