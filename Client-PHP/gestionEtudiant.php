<?php 
    $client = new SoapClient('http://10.7.226.180:1010/GestionEtudiant?wsdl');
?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Liste des étudiants</title>
        <link rel="stylesheet" href="stylee.css">
    </head>


    <body>
        <?php
            if (isset($_POST['nom'], $_POST['prenom'], $_POST['login'], $_POST['mdp']))
            {
                $parametres = array(
                    'id' => $_POST['id'],
                    'nom' => $_POST['nom'],
                    'prenom' => $_POST['prenom'],
                    'login' => $_POST['login'],
                    'mdp' => $_POST['mdp']
                );

                $client->__soapCall('ajouter', array());

            }
        ?>

        <h1>Liste des étudiants</h1>
        <?php
            $etudiants = $client->__soapCall('Lister', array());

            if (!empty($etudiants->return))
            {?>
                <table>    
                    <tr>
                        <th>Nom</th>
                        <th>Prénom</th>
                        <th>login</th>
                        <th>mdp</th>                       
                    </tr><?php
                    if (!is_array($etudiants->return))
                    {?>}
                        <tr>
                            <td><?= $etudiants->return->nom ?></td>
                            <td><?= $etudiants->return->prenom ?></td>
                            <td><?= $etudiants->return->login ?></td>
                            <td><?= $etudiants->return->mdp ?></td>
            </tr><?php
            }
            else
            {
                foreach ($etudiants->return as $etudiant)
                {?>
                    <tr>
                        <td><?= $etudiant->nom ?></td>
                        <td><?= $etudiant->prenom ?></td>
                        <td><?= $etudiant->login ?></td>
                        <td><?= $etudiant->mdp ?></td>
                    </tr><?php
                }
            }?>
                
            
        <table><?php
    }
    else
    {
        echo '<p>Aucune liste</p>';
    }
  ?>
                 <input type="submit" value="Ajouter">
                 <input type="submit" value="Modifier">
                 <input type="submit" value="Supprimer">
</body>
</html>
