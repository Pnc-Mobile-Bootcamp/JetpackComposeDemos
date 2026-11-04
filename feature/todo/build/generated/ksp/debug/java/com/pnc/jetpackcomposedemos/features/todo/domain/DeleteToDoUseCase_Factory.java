package com.pnc.jetpackcomposedemos.features.todo.domain;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class DeleteToDoUseCase_Factory implements Factory<DeleteToDoUseCase> {
  private final Provider<ToDoRepository> toDoRepositoryProvider;

  private DeleteToDoUseCase_Factory(Provider<ToDoRepository> toDoRepositoryProvider) {
    this.toDoRepositoryProvider = toDoRepositoryProvider;
  }

  @Override
  public DeleteToDoUseCase get() {
    return newInstance(toDoRepositoryProvider.get());
  }

  public static DeleteToDoUseCase_Factory create(Provider<ToDoRepository> toDoRepositoryProvider) {
    return new DeleteToDoUseCase_Factory(toDoRepositoryProvider);
  }

  public static DeleteToDoUseCase newInstance(ToDoRepository toDoRepository) {
    return new DeleteToDoUseCase(toDoRepository);
  }
}
