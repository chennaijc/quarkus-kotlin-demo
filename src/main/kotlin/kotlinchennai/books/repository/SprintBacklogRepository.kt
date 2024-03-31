package kotlinchennai.books.repository

import io.quarkus.hibernate.orm.panache.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped
import kotlinchennai.books.entity.SprintBItemEntity

@ApplicationScoped
class SprintBacklogRepository: PanacheRepository<SprintBItemEntity>