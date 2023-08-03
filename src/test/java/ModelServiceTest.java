import entity.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import repository.ModelRepository;
import service.ModelService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ModelServiceTest {

    @Mock
    private ModelRepository modelRepository;

    @InjectMocks
    private ModelService modelService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetNameById_ModelFound() {
        Long id = 1L;
        String expectedName = "John Doe";

        // Підроблено об'єкт Model, який повертаємо з репозиторію
        Model mockedModel = new Model(id, expectedName);

        // Коли викликаємо метод findModelById з певним id, повернути підроблений об'єкт Model
        when(modelRepository.findModelById(id)).thenReturn(mockedModel);

        // Викликати метод getNameById
        String actualName = modelService.getNameById(id);

        // Перевірити, чи повернуто правильне ім'я
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetNameById_ModelNotFound() {
        Long id = 1L;

        // Коли викликаємо метод findModelById з певним id, повернути null
        when(modelRepository.findModelById(id)).thenReturn(null);

        // Викликати метод getNameById
        String actualName = modelService.getNameById(id);

        // Перевірити, чи повернуто null, оскільки модель з таким id не знайдена
        assertEquals(null, actualName);
    }
}
