package Main;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Sorting {
    int recordBook = 5543;
    int C11 = recordBook % 11; //10

    public void Sort() throws Exception {
        BuildingBlocks[] arr = {
                new BuildingBlocks("Glass", "Mobile", "Ordinary", 0, 1, true),
                new BuildingBlocks("Diamond", "Mobile", "Ordinary", 5, 0, false),
                new BuildingBlocks("Lightstone", "Mobile", "Underground", 0, 4, false)
        };
        System.out.println("Initial arrays:");
        Stream.of(arr).forEach(System.out::println);

        List<BuildingBlocks> sortedByHardnessAsc = Stream.of(arr)
                .sorted((a, b) -> a.hardness - b.hardness)
                .toList();

        List<BuildingBlocks> sortedByLightLevelDesc = Stream.of(arr)
                .sorted((a, b) -> b.lightLevel - a.lightLevel)
                .toList();

        System.out.println("\nSort by hardness (by growth):");
        sortedByHardnessAsc.forEach(System.out::println);

        System.out.println("\nSort by light level (descending):");
        sortedByLightLevelDesc.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the block name to search:");
        String blockName = scanner.nextLine();

        Optional<BuildingBlocks> foundBlock = Stream.of(arr)
                .filter(block -> block.getName().equalsIgnoreCase(blockName))
                .findFirst();

        if (foundBlock.isPresent()) {
            System.out.println("Block found: " + foundBlock.get());
        } else {
            System.out.println("Block not found :(");
        }
    }
}
