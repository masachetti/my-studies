var getAdmins = function(users) {
    let admins = []
    for (const user of users) {
        if (user[1] === 'Admin'){
            admins.push(user[0]);
        }
    }
    return admins;
}

var users = new Map();
users.set("Pedro", "User");
users.set("Ana", "Admin");
users.set("Joao", "Admin");
users.set("Luiz", "User");
users.set("Bia", "Admin");
users.set("Mateus", "User");
console.log(users);

console.log(getAdmins(users));