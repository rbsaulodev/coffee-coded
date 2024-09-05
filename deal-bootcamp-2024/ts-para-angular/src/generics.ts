//Generics
function printArray<T>(values: T[]): T[]{
    return values;
}

let dateString = printArray<string>(["saulo", "brilhante", "fosco"]);
let dateNumber = printArray<number>([1, 2, 3]);