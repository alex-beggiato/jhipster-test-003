import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'c',
        data: { pageTitle: 'appNoSqlApp.appNoSqlC.home.title' },
        loadChildren: () => import('./appNoSql/c/c.module').then(m => m.AppNoSqlCModule),
      },
      {
        path: 'e',
        data: { pageTitle: 'appNoSqlApp.appNoSqlE.home.title' },
        loadChildren: () => import('./appNoSql/e/e.module').then(m => m.AppNoSqlEModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class EntityRoutingModule {}
