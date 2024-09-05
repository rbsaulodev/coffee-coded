function minLength(length: number) {
    return (target: any, key: string) => {
        let _value = target[key];

        const getter = () => "[API]" + _value;
        ;
        const setter = (value: string) => {
            if (value.length < length) {
                throw new Error(`Nome menor que ${length}`);
            }
            _value = value;
        };

        Object.defineProperty(target, key, { get: getter, set: setter });
    };
}

function apiVersion(version: string) {
    return (constructor: Function) => {
        constructor.prototype.__version = version;
    };
}

@apiVersion("1.10")
class api {
    @minLength(5)
    name: string;

    constructor(name: string) {
        this.name = name;
    }
}

const Api = new api("shine-drive");
console.log(Api.__version);
console.log(Api.name)
