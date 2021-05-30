import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DahampasalaComponent } from './web/dahampasala/dahampasala.component';
import { BoardAdminComponent } from './fnd/board-admin/board-admin.component';
import { BoardModeratorComponent } from './fnd/board-moderator/board-moderator.component';
import { BoardUserComponent } from './fnd/board-user/board-user.component';
import { LoginComponent } from './fnd/login/login.component';
import { ProfileComponent } from './fnd/profile/profile.component';
import { RegisterComponent } from './fnd/register/register.component';
import { HomeComponent } from './home/home.component';
import { TeacherComponent } from './web/teacher/teacher.component';
import { AddressComponent } from './web/address/address.component';
 

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'profile', component: ProfileComponent },
  { path: 'user', component: BoardUserComponent },
  { path: 'mod', component: BoardModeratorComponent },
  { path: 'admin', component: BoardAdminComponent },
  { path: 'dahampasala', component: DahampasalaComponent },
  { path: 'teacher', component: TeacherComponent },
  { path: 'address', component: AddressComponent },
  { path: '', redirectTo: 'home', pathMatch: 'full' }
];
 
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }