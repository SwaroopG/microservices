                      $.getJSON('http://localhost:8080/library/assets/all', function(data) {
                        console.log(data); 
                        var div = document.getElementById('asset-table-body');
                        for(i = 0; i < data.length; i++ ){
                          var tr = document.createElement('tr');
                          tr.innerHTML = '<td>'+data[i].id+'</td><td>'+ data[i].title+'</td><td>'+data[i].author;
                          div.appendChild(tr);
                        }
                    });