import pl.basepoint.spring.web.controller.CatController
import pl.basepoint.spring.web.model.Cat
import pl.basepoint.spring.web.repository.CatRepository
import pl.basepoint.spring.web.service.CatService

beans {
    jasper(Cat, name: 'Jasper')
    gizmo(Cat, name: 'Gizmo')

    catRepository(CatRepository, cats: [jasper, gizmo])
    catService(CatService, catRepository: catRepository)
    catController(CatController, catService: catService)

}