import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UploadmediaComponent } from './media/uploadmedia/uploadmedia.component';
import { MymediaComponent } from './media/mymedia/mymedia.component';
import { FollowersComponent } from './media/followers/followers.component';
import { AccountComponent } from './media/account/account.component';
import { LoginComponent } from './auth/login/login.component';
import { RegisterComponent } from './auth/register/register.component';


const routes: Routes = [
  {path:"uploadmedia",component:UploadmediaComponent},
  {path:"mymedia",component:MymediaComponent},
  {path:"followers",component:FollowersComponent},
  {path:"account",component:AccountComponent},
  {path:"login",component:LoginComponent},
  {path:"register",component:RegisterComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
