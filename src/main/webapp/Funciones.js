/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

function consultar()
{
    var dato = '';
    var urlFoto = '';
    var url = 'https://api.nytimes.com/svc/archive/v1/2022/9.json?api-key=pmrpWHsv0izyMz3GGzQFGGV9Pbe0fUPx';
    $.ajax({
        type: 'GET',
        url: url,
        success: function (registro)
        {
            dato += "<thead> <tr> <th>Titulo</th> <th>Abstract</th> <th>Byline</th> <th>URL</th> </tr> </thead> <tbody>";
            console.log(registro.response.docs.length);
            for (var i = 0; i < 5; i++) {
                try {
                    urlFoto = registro.response.docs[i].multimedia[0].url;
                } catch (error) {
                    urlFoto = '--';
                }
                dato += " <tr> <td>" + registro.response.docs[i].headline.main + "</td> <td>" + registro.response.docs[i].abstract + "</td> <td>" + registro.response.docs[i].byline.original + "</td> <td>" + urlFoto + "</td> </tr>";
            }
            dato += "</tbody>";
            $("#table_news").append(dato);
            console.log('Ingrese a success');
        },
        complete: function ()
        {
            console.log('Ingrese a complete');
        },
        error: function (registro)
        {
            console.log("Error en URL" + registro);
        }
    });
    return false;
}


function guardar()
{
    var dato = '';
    var url = 'https://api.nytimes.com/svc/archive/v1/2022/9.json?api-key=pmrpWHsv0izyMz3GGzQFGGV9Pbe0fUPx';
    $.ajax({
        type: 'GET',
        url: url,
        success: function (registro)
        {

            for (var i = 0; i < 5; i++) {
                 try {
                    urlFoto = registro.response.docs[i].multimedia[0].url;
                } catch (error) {
                    urlFoto = '--';
                }
                guardar_noticia(registro.response.docs[i].headline.main,
                        registro.response.docs[i].abstract,
                        registro.response.docs[i].byline.original,
                        urlFoto);
            }

            console.log('Ingrese a success');
        },
        complete: function ()
        {
            console.log('Ingrese a complete');
        },
        error: function (registro)
        {
            console.log("Error en URL" + registro);
        }
    });
    return false;
}

function guardar_noticia(titulo, abstract, byLine, urlFoto) {

    var datospr = "";

    var url = 'Gestion_guardar';
    $.ajax({
        type: 'POST',
        url: url,
        data: 'titulo=' + titulo
                + '&datAbstract=' + abstract
                + '&byLine=' + byLine + '&urlFoto=' +urlFoto, //1 = 'GM' | 2 = 'VD'
        success: function (registro)
        {

        },
        error: function (registro)
        {
            console.log("Error en URL" + registro);
        }
    });

}
